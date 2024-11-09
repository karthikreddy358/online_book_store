import javax.swing.*;
import java.awt.*;

public class RegistrationForm extends JFrame {

    public RegistrationForm() {
        setTitle("Online Bookstore Registration");
        setSize(600, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Background Panel with custom painting for background image
        JPanel backgroundPanel = new JPanel() {
            private Image backgroundImage;

            {
                // Load the background image using an absolute path
                backgroundImage = new ImageIcon("C:/Users/Karthik.Reddy/OneDrive/Desktop/java/1657300290.jpg").getImage();
            }

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (backgroundImage != null) {
                    g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
                }
            }
        };
        backgroundPanel.setLayout(new BorderLayout());

        // Define a blue-green color for the header, footer, and form panel
        Color blueGreenColor = new Color(0, 139, 139); // Dark cyan (blue-green)

        // Header Panel with blue-green background and left-aligned text
        JPanel headerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER)); // Use FlowLayout with left alignment
        headerPanel.setBackground(blueGreenColor); // Blue-Green background
        JLabel headerLabel = new JLabel("Welcome to Online Bookstore");
        headerLabel.setFont(new Font("Arial", Font.BOLD, 50)); // Bold font
        headerLabel.setForeground(Color.WHITE); // White text for contrast
        headerPanel.add(headerLabel);

        // Footer Panel with blue-green background
        JPanel footerPanel = new JPanel();
        footerPanel.setBackground(blueGreenColor); // Blue-Green background
        JLabel footerLabel = new JLabel("Thank you for visiting our bookstore!");
        footerLabel.setFont(new Font("Arial", Font.BOLD, 14)); // Bold font
        footerLabel.setForeground(Color.WHITE); // White text for contrast
        footerPanel.add(footerLabel);

        // Left-aligned Form Panel with transparent background and blue-green color accents
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setOpaque(false); // Make background transparent
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Add form components with blue-green accents
        // Username
        JLabel usernameLabel = new JLabel("Enter user name:");
        usernameLabel.setFont(new Font("Arial", Font.BOLD, 25)); // Bold font
        usernameLabel.setForeground(Color.BLACK); // Black text for labels
        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(usernameLabel, gbc);

        JTextField usernameField = new JTextField(20);
        usernameField.setBackground(Color.WHITE); // White background for input fields
        usernameField.setForeground(Color.BLACK); // Black text for input fields
        usernameField.setFont(new Font("Arial", Font.BOLD, 14)); // Bold font
        gbc.gridx = 1;
        formPanel.add(usernameField, gbc);

        // Email
        JLabel emailLabel = new JLabel("Enter the Email address:");
        emailLabel.setFont(new Font("Arial", Font.BOLD, 25)); // Bold font
        emailLabel.setForeground(Color.BLACK); // Black text for labels
        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(emailLabel, gbc);

        JTextField emailField = new JTextField(20);
        emailField.setBackground(Color.WHITE); // White background for input fields
        emailField.setForeground(Color.BLACK); // Black text for input fields
        emailField.setFont(new Font("Arial", Font.BOLD, 14)); // Bold font
        gbc.gridx = 1;
        formPanel.add(emailField, gbc);

        // Phone Number
        JLabel phoneLabel = new JLabel("Enter Phone Number:");
        phoneLabel.setFont(new Font("Arial", Font.BOLD, 25)); // Bold font
        phoneLabel.setForeground(Color.BLACK); // Black text for labels
        gbc.gridx = 0;
        gbc.gridy = 2;
        formPanel.add(phoneLabel, gbc);

        JTextField phoneField = new JTextField(20);
        phoneField.setBackground(Color.WHITE); // White background for input fields
        phoneField.setForeground(Color.BLACK); // Black text for input fields
        phoneField.setFont(new Font("Arial", Font.BOLD, 14)); // Bold font
        gbc.gridx = 1;
        formPanel.add(phoneField, gbc);

        // Password
        JLabel passwordLabel = new JLabel("Enter strong password:");
        passwordLabel.setFont(new Font("Arial", Font.BOLD, 25)); // Bold font
        passwordLabel.setForeground(Color.BLACK); // Black text for labels
        gbc.gridx = 0;
        gbc.gridy = 3;
        formPanel.add(passwordLabel, gbc);

        JPasswordField passwordField = new JPasswordField(20);
        passwordField.setBackground(Color.WHITE); // White background for input fields
        passwordField.setForeground(Color.BLACK); // Black text for input fields
        passwordField.setFont(new Font("Arial", Font.BOLD, 14)); // Bold font
        gbc.gridx = 1;
        formPanel.add(passwordField, gbc);

        // District
        JLabel districtLabel = new JLabel("Enter district:");
        districtLabel.setFont(new Font("Arial", Font.BOLD, 25)); // Bold font
        districtLabel.setForeground(Color.BLACK); // Black text for labels
        gbc.gridx = 0;
        gbc.gridy = 4;
        formPanel.add(districtLabel, gbc);

        JTextField districtField = new JTextField(10);
        districtField.setBackground(Color.WHITE); // White background for input fields
        districtField.setForeground(Color.BLACK); // Black text for input fields
        districtField.setFont(new Font("Arial", Font.BOLD, 25)); // Bold font
        gbc.gridx = 1;
        formPanel.add(districtField, gbc);

        // Pincode
        JLabel pincodeLabel = new JLabel("Enter Pincode:");
        pincodeLabel.setFont(new Font("Arial", Font.BOLD, 25)); // Bold font
        pincodeLabel.setForeground(Color.BLACK); // Black text for labels
        gbc.gridx = 0;
        gbc.gridy = 5;
        formPanel.add(pincodeLabel, gbc);

        JTextField pincodeField = new JTextField(10);
        pincodeField.setBackground(Color.WHITE); // White background for input fields
        pincodeField.setForeground(Color.BLACK); // Black text for input fields
        pincodeField.setFont(new Font("Arial", Font.BOLD, 14)); // Bold font
        gbc.gridx = 1;
        formPanel.add(pincodeField, gbc);

        // Address
        JLabel addressLabel = new JLabel("Enter the Address:");
        addressLabel.setFont(new Font("Arial", Font.BOLD, 25)); // Bold font
        addressLabel.setForeground(Color.BLACK); // Black text for labels
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        formPanel.add(addressLabel, gbc);

        JTextArea addressArea = new JTextArea(4, 20);
        JScrollPane addressScrollPane = new JScrollPane(addressArea);
        addressArea.setBackground(Color.WHITE); // White background for text area
        addressArea.setForeground(Color.BLACK); // Black text for text area
        addressArea.setFont(new Font("Arial", Font.BOLD, 14)); // Bold font
        gbc.gridx = 1;
        gbc.gridy = 6;
        formPanel.add(addressScrollPane, gbc);

        // Sign In Button with blue-green background
        JButton signInButton = new JButton("Sign in");
        signInButton.setBackground(blueGreenColor); // Blue-Green background for button
        signInButton.setForeground(Color.WHITE); // White text for button
        signInButton.setFont(new Font("Arial", Font.BOLD, 25)); // Bold font
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        formPanel.add(signInButton, gbc);

        // Place components in background panel
        backgroundPanel.add(headerPanel, BorderLayout.NORTH);
        backgroundPanel.add(formPanel, BorderLayout.CENTER);
        backgroundPanel.add(footerPanel, BorderLayout.SOUTH);

        add(backgroundPanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(RegistrationForm::new);
    }
}
