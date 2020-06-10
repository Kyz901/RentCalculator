import PaymentObjects.*;

import javax.swing.*;
import java.awt.*;

public class PainterComponent extends JComponent {

    public void paintComponent(Graphics g) {
        repaint();
        Graphics2D g2 = (Graphics2D) g;
        Color c1 = new Color(10, 7, 10);
        Font font = new Font("Time`s New Roman", Font.BOLD, 24);

        g2.setFont(font);
        g2.setColor(c1);

        g2.drawString("1. Плата за 1м3 газа =  " + Gas.prise, 60, 100);
        g2.drawString("2. Плата за 1м3 воды = " + Water.prise, 60, 125);
        g2.drawString("3. Плата за использование канализации = " + Canalization.prise, 60, 150);
        g2.drawString("4. Плата за вынос мусора = " + Rubbish.prise, 60, 175);
        g2.drawString("5. Плата за ВЭР = " + Ver.prise, 60, 200);
        repaint();

    }
}
