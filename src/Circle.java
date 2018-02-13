import javax.swing.*;

public class Circle {
// Written by: Mike Baldwin
// Determines if a 2-Dimensional point is within a circle of radius 10 centered at the origin

public static void main(String[] args) {
    JPanel panel;
    JTextField xVar, yVar;
    int x, y, confirmCode;
    boolean isInCircle;

    panel = new JPanel();
    xVar = new JTextField(3); yVar = new JTextField(3);
    panel.add(new JLabel("x: ")); panel.add(xVar);
    panel.add(Box.createHorizontalStrut(15));
    panel.add(new JLabel("y: ")); panel.add(yVar);

    confirmCode = JOptionPane.showConfirmDialog(null, panel,
            "Enter a point with two coordinates", JOptionPane.OK_CANCEL_OPTION);
    if (confirmCode == JOptionPane.OK_OPTION) {
        x = Integer.parseInt(xVar.getText());
        y = Integer.parseInt(yVar.getText());
        isInCircle = Distance(x, y) < 10.0f;
        JOptionPane.showMessageDialog(null, "Point (" + x + ", " + y + ") " +
                (isInCircle ? "is " : "is not ") + "in the circle.");
    }
}

private static float Distance(int x, int y) {
    return (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
}
}
