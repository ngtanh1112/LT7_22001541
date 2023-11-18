package LT7_22001541_NguyenTuanAnh.BT3_LT7_22001541;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Game {
    ArrayList<Card> deck;
    ArrayList<Card> cardList;
    Random random = new Random();
    private int nums = 0;
    //Card
    private class Card implements Comparable<Card>{
        String value;
        String type;
        public Card(String value, String type) {
            this.value = value;
            this.type = type;
        }
        public String toString() {
            return value + "-" + type;
        }

        public String getValue() {
            return this.value;
        }
        public String getType() {
            return this.type;
        }

        @Override
        public int compareTo(Card other) {
                Integer thisValue = convertValue(this.value);
                Integer otherValue = convertValue(other.value);
                int valueComparison = thisValue.compareTo(otherValue);
                if (valueComparison != 0) {
                    return valueComparison;
                }
                return this.type.compareTo(other.type);
        }
        private int convertValue(String value) {
            try {
                return Integer.parseInt(value);
            } catch (NumberFormatException e) {
                if (value.equals("J")) {
                    return 11;
                } else if(value.equals("10")) {
                    return 10;
                } else if (value.equals("Q")) {
                    return 12;
                } else if (value.equals("K")) {
                    return 13;
                } else if (value.equals("A")) {
                    return 14;
                }
            }
            return 0;
        }
        private String getPath() {
            return "./cards/" + toString() + ".png";
        }
    }

    //For Window
    int boardWidth = 600;
    int boardHeight = boardWidth;
    int cardWidth = 50;
    int cardHeight = 65;
    JFrame frame = new JFrame("Card Sorting Test");
    JTextField numOfCard = new JTextField();
    JPanel gamePanel = new JPanel() {
        @Override
        public void paintComponent(Graphics graphic) {
            super.paintComponent(graphic);
            int dx = 20;
            int dy = 20;
            int cardsPerRow = boardWidth / cardWidth - 2; // Số con bài trên một hàng

            for (int i = 0; i < nums; i++) {
                int row = i / cardsPerRow; // Số hàng chứa con bài
                int col = i % cardsPerRow; // Số cột chứa con bài

                // Tính toán vị trí vẽ của con bài
                int x = dx + col * (cardWidth + 5);
                int y = dy + row * (cardHeight + 5);

                Image cardImg = new ImageIcon(getClass().getResource(deck.get(i).getPath())).getImage();
                graphic.drawImage(cardImg, x, y, cardWidth, cardHeight, null);
            }
        }
    };
    JPanel buttonPanel = new JPanel();
    JPanel bottomPanel = new JPanel();
    JButton shuffleButton = new JButton("Shuffle");
    JButton sortButton = new JButton("Sort");
    JButton prevButton = new JButton("-1");
    JButton nextButton = new JButton("+1");
    JButton drawButton = new JButton("Draw");

    Game() {
        startGame();

        //Set Frame
        frame.setVisible(true);
        frame.setSize(boardWidth,boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //SetLayout
        gamePanel.setLayout(new BorderLayout());
        gamePanel.setBackground(new Color(53, 107, 77));
        frame.add(gamePanel);

        //Set TextField
        numOfCard.setPreferredSize(new Dimension(40, 30));


        //Set Button
        bottomPanel.setLayout(new BorderLayout());

        // Đặt buttonPanel vào phía trên của bottomPanel
        bottomPanel.add(buttonPanel, BorderLayout.NORTH);

        shuffleButton.setFocusable(false);
        buttonPanel.add(shuffleButton);
        prevButton.setFocusable(false);
        buttonPanel.add(prevButton);
        numOfCard.setFocusable(true);
        buttonPanel.add(numOfCard);
        nextButton.setFocusable(false);
        buttonPanel.add(nextButton);
        sortButton.setFocusable(false);
        buttonPanel.add(sortButton);

        bottomPanel.add(drawButton, BorderLayout.SOUTH);
        frame.add(bottomPanel, BorderLayout.SOUTH);



        //Set Events
        shuffleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                shuffleDeck();
                gamePanel.repaint();
            }
        });

        sortButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sortDeck();
                gamePanel.repaint();
            }
        });

        numOfCard.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = numOfCard.getText(); // Lấy giá trị từ JTextField
                nums = Integer.parseInt(input);
                gamePanel.repaint();
            }
        });

        prevButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = numOfCard.getText();
                int temp = Integer.parseInt(input);
                temp -= 1;
                // Tăng giá trị biến tạm lên 1

                // Cập nhật giá trị mới lên giao diện
                numOfCard.setText(Integer.toString(temp));

                gamePanel.repaint();
            }
        });

        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = numOfCard.getText();
                int temp = Integer.parseInt(input);
                temp += 1;
                // Tăng giá trị biến tạm lên 1

                // Cập nhật giá trị mới lên giao diện
                numOfCard.setText(Integer.toString(temp));

                gamePanel.repaint();
            }
        });

        drawButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = numOfCard.getText(); // Lấy giá trị từ JTextField
                nums = Integer.parseInt(input);
                buildRandomDeck();

                gamePanel.repaint();
            }
        });

        gamePanel.repaint();

    }
    public void startGame() {
        //Draw
        buildDeck();

        //Shuffle
        shuffleDeck();

    }
    public void buildDeck() {
        deck = new ArrayList<Card>();
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] types = {"H", "D", "C", "S"};

        for (int i = 0; i < types.length; i++) {
            for (int j = 0; j < values.length; j++) {
                Card card = new Card(values[j], types[i]);
                if (deck.size() == nums) {
                    break;
                }
                deck.add(card);
            }
        }
    }

    public void buildRandomDeck() {
        deck = new ArrayList<Card>();
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] types = {"H", "D", "C", "S"};

        ArrayList<Card> tempDeck = new ArrayList<Card>();

        for (int i = 0; i < types.length; i++) {
            for (int j = 0; j < values.length; j++) {
                Card card = new Card(values[j], types[i]);
                tempDeck.add(card);
            }
        }

        Collections.shuffle(tempDeck); // Đảo ngẫu nhiên mảng tạm

        int numOfCards = Math.min(nums, tempDeck.size());
        deck = new ArrayList<Card>(tempDeck.subList(0, numOfCards));
    }
    public void shuffleDeck() {
        for (int i = 0; i < deck.size(); i++) {
            int j = random.nextInt(deck.size());
            Card currCard = deck.get(i);
            Card randomCard = deck.get(j);
            deck.set(i, randomCard);
            deck.set(j, currCard);
        }

        System.out.println("AFTER SHUFFLE: ");
        System.out.println(deck);
    }
    public void sortDeck() {
        Collections.sort(deck);
        System.out.println("AFTER SORT: ");
        System.out.println(deck);
    }

}
