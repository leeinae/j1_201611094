package com.sd.gui;
import java.awt.event.*;
import javax.swing.*;


public class CalcAreaListener implements ActionListener {
  public void actionPerformed(ActionEvent e) {
    System.out.println("Hello");
    JButton b =(JButton)e.getSource(); //�̺�Ʈ�� �߻��� �ҽ�������..
    String cmd = e.getActionCommand(); //��ư���� ���� ����
    if (cmd.equals("���")) {
      System.out.println("��� ��ư");
      b.setText("����߽��ϴ�.");
    }
    else if (cmd.equals("���")) {
      System.out.println("��ҵǾ�����.");
    }
    
    
  }
}