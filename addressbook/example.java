package addressbook;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.KeyEvent;
import java.awt.event.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class example extends JFrame implements ActionListener {
  public JFrame f;
  public JPanel Main, panel;
  public Container contentPane;
  public DefaultTableModel model;
  public JTable table;
  public JScrollPane scrollpane;
  public JLabel mainname, labelname, labelnum, labelage, labeladd;
  public JTextField nameT, numberT, ageT,addT;
  public JButton b1,b2,b3,b4;
//  public int Index;

  
    
  public example() {
    f= new JFrame("�ּҷ�");
//    f.setSize(300,200);
//    f.setResizable(false);
    contentPane = getContentPane();
    contentPane.setLayout(new GridLayout(2,1));
    Main= new JPanel();
    panel = new JPanel(new GridLayout(3,4));

    
    String header[]={"�̸�","��ȣ","����","�ּ�"};
    String contents[][] ={
      {"���ξ�","01033746349","21","����"}
    };
    model = new DefaultTableModel(contents,header);
    table = new JTable(model);
    scrollpane = new JScrollPane(table);
    mainname = new JLabel("�ּҷ�",JLabel.CENTER);
    labelname = new JLabel("�̸�",JLabel.CENTER);
    labelnum = new JLabel("��ȣ",JLabel.CENTER);
    labelage = new JLabel("����",JLabel.CENTER);
    labeladd = new JLabel("�ּ�",JLabel.CENTER);
    nameT = new JTextField(20);
//    nameT.setText("�̸� �Է�");
    numberT = new JTextField(20);
//    numberT.setText("�޴��� ��ȣ �Է�");
    ageT = new JTextField(20);
//    ageT.setText("���� �Է�");
    addT = new JTextField(20);
//    addT.setText("�ּ� �Է�");
    
    b1 = new JButton("���");
    b1.addActionListener(this);
    b2= new JButton("����");
    b2.addActionListener(this);
    b3 = new JButton("����");
    b3.addActionListener(this);
    b4 = new JButton("�˻�");
    b4.addActionListener(this);
    
    Main.add(mainname);
    Main.add(scrollpane,BorderLayout.CENTER);
    panel.add(labelname);
    panel.add(nameT);
    panel.add(labelnum);
    panel.add(numberT);
    panel.add(labelage);
    panel.add(ageT);
    panel.add(labeladd);
    panel.add(addT);
    panel.add(b1);
    panel.add(b2);
    panel.add(b3);
    panel.add(b4);
    contentPane.add(Main);
    contentPane.add(panel);
  }
  
  public void actionPerformed(ActionEvent e){
      PersonDaoImpl personDaoImpl = new PersonDaoImpl();
      Person p = new Person();
      String cmd = e.getActionCommand();
      String info[]= new String[4];
      int row = table.getSelectedRow();
      int col = table.getSelectedColumn();
      switch (e.getActionCommand()) {
        case "���" : System.out.println("���");
        p.setName(nameT.getText());
        p.setAddress(addT.getText());
        p.setAge(Integer.parseInt(ageT.getText()));
        p.setNumber(numberT.getText());
        System.out.println(p.toString());
        info[0]=nameT.getText();
        info[1]=numberT.getText();
        info[2]=ageT.getText();
        info[3]=addT.getText();
        model.addRow(info);
        personDaoImpl.insert(p);
        clear();
        
        break;
        case "����" : System.out.println("����");
        if(table.getSelectedRow() ==-1) {
          return;
        }
        else {
          System.out.println(table.getValueAt(row,0)+" is delete!");
          personDaoImpl.delete((String)table.getValueAt(row,0));
          System.out.println((String)table.getValueAt(row,0));
          model.removeRow(table.getSelectedRow());
          loading();
        }
        break;
        case "����" : System.out.println("����");
        p.setName(nameT.getText());
        p.setAddress(addT.getText());
        p.setAge(Integer.parseInt(ageT.getText()));
        p.setNumber(numberT.getText());
        System.out.println(p);
        personDaoImpl.update(p);
        loading();
        break;
        case "�˻�" : System.out.println("�˻�");
        p= personDaoImpl.findById(nameT.getText());
        numberT.setText(p.getNumber());
        ageT.setText(Integer.toString(p.getAge()));
        addT.setText(p.getAddress());
        System.out.println(p);
        break;
        default: System.out.println("�׷�������..");
        break;
      }
  }
  public void clear() {
    nameT.setText("");
    numberT.setText("");
    addT.setText("");
    ageT.setText("");
  }
  public static void loading() {
      PersonDaoImpl personDaoImpl = new PersonDaoImpl();
    Person p = new Person();
    List<Person> persons = personDaoImpl.findAll();
    Iterator iter=persons.iterator();
    while(iter.hasNext()) {
        p=(Person)iter.next();
        System.out.println(p.toString());
      }
  }
  public static void main(String[] args) {
    example GUI = new example();
    loading();
    GUI.setDefaultCloseOperation(EXIT_ON_CLOSE);     
    GUI.pack();
    GUI.setVisible(true);
  }
}

