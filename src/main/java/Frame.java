import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame{

    public static JFrame getFrame(){

            JFrame jFrame = new JFrame() {};
            jFrame.setVisible(true);
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.setBounds(500, 0,500, 300);
            jFrame.setTitle("TEST");
            return jFrame;
        }

        JFrame jFrame = getFrame();
    

//        jFrame.add(new PainterComponent());
//        JMenuBar jMenuBar = new JMenuBar();
//        jFrame.setJMenuBar(jMenuBar);
//        JMenu settings = new JMenu("Настройки");
//        jMenuBar.add(settings);
//
//        JCheckBox privilegesCheckBox = new JCheckBox("Льготные тарифы", false);
//
//
//
//        settings.addSeparator();
//        settings.add(new JMenuItem("Изменить тарифы")).addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JFrame f1 = new JFrame("Настройки");
//
//                f1.setBounds(0, 0, 860, 460);
//                f1.setLocation(90, 100);
//                f1.setLayout(null);
//                f1.setVisible(true);
//                TextField tS1 = new TextField("0", 1);
//                TextField tS2 = new TextField("0", 1);
//                TextField tS3 = new TextField("0", 1);
//                TextField tS4 = new TextField("0", 1);
//                TextField tS5 = new TextField("0", 1);
//                JLabel lS1 = new JLabel("Тариф за Воду");
//                JLabel lS2 = new JLabel("Тариф за Воду(Канализация)");
//                JLabel lS3 = new JLabel("Тариф за Газ");
//                JLabel lS4 = new JLabel("Тариф за Мусор");
//                JLabel lS5 = new JLabel("Тариф за ВЭР");
//                JButton bS1 = new JButton("Сохранить изменения");
//                JButton bS2 = new JButton("Отмена");
//                f1.add(tS1);
//                f1.add(tS2);
//                f1.add(tS3);
//                f1.add(tS4);
//                f1.add(tS5);
//
//                f1.add(lS1);
//                f1.add(lS2);
//                f1.add(lS3);
//                f1.add(lS4);
//                f1.add(lS5);
//
//                f1.add(bS1);
//                f1.add(bS2);
//                lS1.setVisible(true);
//                lS1.setBounds(250, 50, 175, 25);
//
//                lS2.setVisible(true);
//                lS2.setBounds(250, 100, 175, 25);
//                lS3.setVisible(true);
//                lS3.setBounds(250, 150, 175, 25);
//                lS4.setVisible(true);
//                lS4.setBounds(250, 200, 175, 25);
//                lS5.setVisible(true);
//                lS5.setBounds(250, 250, 175, 25);
//
//                tS1.setBounds(450, 50, 175, 25);
//                tS1.setVisible(true);
//                tS2.setBounds(450, 100, 175, 25);
//                tS2.setVisible(true);
//                tS3.setBounds(450, 150, 175, 25);
//                tS3.setVisible(true);
//                tS4.setBounds(450, 200, 175, 25);
//                tS4.setVisible(true);
//                tS5.setBounds(450, 250, 175, 25);
//                tS5.setVisible(true);
//
//
//                bS1.setBounds(262, 320, 170, 40);//72,450,500,125
//                bS1.setBackground(Color.lightGray);
//                bS1.setVisible(true);
//
//                bS2.setBounds(442, 320, 170, 40);//72,450,500,125
//                bS2.setBackground(Color.lightGray);
//                bS2.setVisible(true);
//                bS1.addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                        String saveWater = tS1.getText();
//                        if (saveWater == null) {
//                            saveWater = "0";
//                        }
//                        //Saver.saveToFileWater(saveWater);
//
//                        String saveCanal = tS2.getText();
//                        if (saveCanal == null) {
//                            saveCanal = "0";
//                        }
//                        //Saver.saveToFileCanal(saveCanal);
//
//                        String saveGaz = tS3.getText();
//                        if (saveGaz == null) {
//                            saveGaz = "0";
//                        }
//                        //Saver.saveToFileGaz(saveGaz);
//
//                        String saveMusor = tS4.getText();
//                        if (saveMusor == null) {
//                            saveMusor = "0";
//                        }
//                        //Saver.saveToFileMusor(saveMusor);
//
//                        String saveVer = tS5.getText();
//                        if (saveVer == null) {
//                            saveVer = "0";
//                        }
//                        //Saver.saveToFileVer(saveVer);
//
//                        f1.setTitle("НАСТРОЙКИ УСПЕШНО СОХРАНЕНЫ!");
//                        repaint();
//                        f1.setVisible(false);
//                    }
//
//                    private void repaint() {
//                        // TODO Auto-generated method stub
//
//                    }
//                });
//                //Кнопка выхода с меню настроек
//                bS2.addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                        f1.setVisible(false);
//                    }
//                });
//
//            }
//        });


//        TextField tfForInWater = new TextField(3);
//        TextField tfForInGas = new TextField(3);
//        TextField tfForSumWater = new TextField(3);
//        TextField tfForSumCanalization = new TextField(3);
//        TextField tfForSumVer = new TextField(3);
//        TextField tfForSumRubbish = new TextField(3);
//        TextField tfForSumGas = new TextField(3);
//        TextField tfFromSumAllNoGas = new TextField(3);
//
//        JLabel waterDescription = new JLabel("Количество за ВОДУ");
//        JLabel gasDescription = new JLabel("Количество за ГАЗ");
//        JLabel waterSumDescription = new JLabel("Сумма за ВОДУ");
//        JLabel canalizationSumDescription = new JLabel("Сумма за ВОДУ (КАНАЛ.)");
//        JLabel verSumDescription = new JLabel("Сумма за ВЭР");
//        JLabel rubbishSumDescription = new JLabel("Сумма за МУСОР");
//        JLabel gasSumDescription = new JLabel("Сумма за ГАЗ");
//        JLabel allNoGasDescription = new JLabel("ИТОГО без ГАЗА");
//
//        JButton acceptDataBtn = new JButton("Подтвердить данные");
//        Font font1 = new Font("", Font.BOLD, 22);
//        acceptDataBtn.setBounds(72, 450, 500, 125);
//        acceptDataBtn.setBackground(Color.lightGray);
//        acceptDataBtn.setFont(font1);
//
//
//        tfForInWater.setBounds(850, 100, 175, 25);
//        tfForInWater.setBackground(Color.white);
//        tfForInWater.setVisible(true);
//        tfForInGas.setBounds(850, 150, 175, 25);
//        tfForInGas.setVisible(true);
//        tfForSumWater.setBounds(850, 300, 175, 25);
//        tfForSumWater.setVisible(true);
//        tfForSumCanalization.setBounds(850, 350, 175, 25);
//        tfForSumCanalization.setVisible(true);
//        tfForSumVer.setBounds(850, 400, 175, 25);
//        tfForSumVer.setVisible(true);
//        tfForSumRubbish.setBounds(850, 450, 175, 25);
//        tfForSumRubbish.setVisible(true);
//        tfForSumGas.setBounds(850, 600, 175, 25);
//        tfForSumGas.setVisible(true);
//        tfFromSumAllNoGas.setBounds(850, 525, 175, 25);
//        tfFromSumAllNoGas.setVisible(true);
//
//
//        waterDescription.setVisible(true);
//        waterDescription.setBounds(690, 100, 150, 25);
//        gasDescription.setVisible(true);
//        gasDescription.setBounds(690, 150, 150, 25);
//        waterSumDescription.setVisible(true);
//        waterSumDescription.setBounds(690, 300, 150, 25);
//        canalizationSumDescription.setVisible(true);
//        canalizationSumDescription.setBounds(690, 350, 150, 25);
//        verSumDescription.setVisible(true);
//        verSumDescription.setBounds(690, 400, 150, 25);
//        rubbishSumDescription.setVisible(true);
//        rubbishSumDescription.setBounds(690, 450, 150, 25);
//        gasSumDescription.setVisible(true);
//        gasSumDescription.setBounds(690, 600, 150, 25);
//        allNoGasDescription.setVisible(true);
//        allNoGasDescription.setBounds(690, 525, 150, 25);
//
//        jFrame.add(waterDescription);
//        jFrame.add(gasDescription);
//        jFrame.add(waterSumDescription);
//        jFrame.add(canalizationSumDescription);
//        jFrame.add(verSumDescription);
//        jFrame.add(rubbishSumDescription);
//        jFrame.add(gasSumDescription);
//        jFrame.add(allNoGasDescription);
//
//        jFrame.add(tfForInWater);
//        jFrame.add(tfForInGas);
//        jFrame.add(tfForSumWater);
//        jFrame.add(tfForSumCanalization);
//        jFrame.add(tfForSumVer);
//        jFrame.add(tfForSumRubbish);
//        jFrame.add(tfForSumGas);
//        jFrame.add(tfFromSumAllNoGas);
//
//        jFrame.add(acceptDataBtn);
//        settings.addSeparator();
//
//
//        settings.add(privilegesCheckBox);
//
//
//        jFrame.revalidate();
//        acceptDataBtn.setVisible(true);




        //Действие при нажатии кнопки "Подсчитать"
//        acceptDataBtn.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                double mod;
//                boolean isSel1 = privilegesCheckBox.isSelected();
//                if (isSel1) {
//                    mod = 0.5;
//                } else {
//                    mod = 1;
//                }
//
////                String rubbish = FileReader.readFromFileMusor();
////                double rubbishDouble = Double.parseDouble(rubbish);
////                double rubbishFinal = rubbishDouble * 1 * mod;
////                tfForSumRubbish.setText(String.valueOf(rubbishFinal));
////
////                String ver = FileReader.readFromFileVer();
////                double verDouble = Double.parseDouble(ver);
////                double verFinal = verDouble * 1 * mod;
////                tfForSumVer.setText(String.valueOf(verFinal));
////
////                String gas1m3 = FileReader.readFromFileGaz();
////                double gas1m3Double = Double.parseDouble(gas1m3);
////                String gasReceived = (tfForInGas.getText());
////                int gasReceivedInteger = Integer.parseInt(gasReceived);
////                double gasFinal = gas1m3Double * gasReceivedInteger * mod;
////                tfForSumGas.setText(String.valueOf(gasFinal));
////
////                String canalization = FileReader.readFromFileCanal();
////                double canalizationDouble = Double.parseDouble(canalization);
////                String canalizationReceived = (tfForInWater.getText());
////                int canalizationReceivedInteger = Integer.parseInt(canalizationReceived);
////                double canalizationFinal = canalizationReceivedInteger * canalizationDouble * 0.8 * mod;
////                tfForSumCanalization.setText(String.valueOf(canalizationFinal));
////
////                String water1M3 = FileReader.readFromFileWater();
////                double water1m3Double = Double.parseDouble(water1M3);
////                String waterReceived = (tfForInWater.getText());
////                int waterReceivedInteger = Integer.parseInt(waterRecieved);
////                double waterFinal = waterReceivedInteger * water1m3Double * mod;
////                tfForSumWater.setText(String.valueOf(waterFinal));
////
////                double total = rubbishFinal + verFinal + canalizationFinal + waterFinal;
////
////                tfFromSumAllNoGas.setText(String.valueOf(total));
//
//            }
//        });


    }



