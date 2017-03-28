package com.sd.gui;
import java.awt.event.*;
import javax.swing.*;


public class CalcAreaListener implements ActionListener {
  public void actionPerformed(ActionEvent e) {
    System.out.println("Hello");
    JButton b =(JButton)e.getSource(); //이벤트가 발생된 소스가져옴..
    String cmd = e.getActionCommand(); //버튼위에 써진 글자
    if (cmd.equals("계산")) {
      System.out.println("계산 버튼");
      b.setText("계산했습니다.");
    }
    else if (cmd.equals("취소")) {
      System.out.println("취소되었슴다.");
    }
    
    
  }
}