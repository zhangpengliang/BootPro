package com.huayong.generator.graphics;

import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.MessageFormat;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.apache.commons.lang3.StringUtils;

import com.huayong.generator.facade.AutoGeneratorCodeUtil;
import com.huayong.generator.facade.Bean;

/**
 * 图形化界面
 * 
 * @author zpl
 * @date 2019年9月9日上午10:19:49
 */
public class GraphicsMain extends JFrame {

	private static final long serialVersionUID = 1L;

	JPanel jp1;
	JPanel jp2;
	JPanel jp3;
	JPanel jp4;
	JPanel jp5;
	JPanel jp6;
	JPanel jp7;
	JPanel jp8;
	JPanel jp9;
	JPanel jp10;
	JLabel jlb1;
	JLabel jlb2;
	JLabel jlb3;
	JLabel jlb4;
	JLabel jlb5;

	JLabel jlb6;
	JLabel jlb7;
	JLabel jlb8;

	JLabel jlb11;
	JLabel jlb21;
	JLabel jlb31;
	JLabel jlb41;
	JLabel jlb51;

	JLabel jlb61;
	JLabel jlb71;
	JLabel jlb81;
	JButton jb1;

	JTextField jtf1;
	JTextField jtf2;
	JTextField jtf3;
	JTextField jtf4;
	JTextField jtf5;
	JTextField jtf6;
	JTextField jtf7;

	public static void main(String[] args) {
		new GraphicsMain();
	}

	public GraphicsMain() {
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		jp4 = new JPanel();
		jp5 = new JPanel();
		jp6 = new JPanel();
		jp7 = new JPanel();
		jp8 = new JPanel();
		jp9 = new JPanel();
		jp9.setSize(325, 125);
		jp10 = new JPanel();
		jp10.setSize(325, 125);
		jlb1 = new JLabel("数据库账户名", JLabel.RIGHT);
		jtf1 = new JTextField(10);
		jtf1.setToolTipText("mysql数据库账号");
		jlb11 = new JLabel("*指定要连接的数据库的账户名信息");
		jp1.add(jlb1);
		jp1.add(jtf1);
		jp1.add(jlb11);
		jp1.setLayout(new GridLayout(1, 3));
		jlb2 = new JLabel("账户密码", JLabel.RIGHT);
		jtf2 = new JTextField(10);
		jtf2.setToolTipText("mysql数据库密码");
		jlb21 = new JLabel("*指定要连接的数据库的账户密码");
		jp2.add(jlb2);
		jp2.add(jtf2);
		jp2.add(jlb21);
		jlb3 = new JLabel("数据库名", JLabel.RIGHT);
		jtf3 = new JTextField(10);
		// jdbc:mysql://awa-mysql.bjidc.com:3306/awa_recommend?characterEncoding=utf-8&useSSL=false
		jtf3.setToolTipText("请指定数据库名称,jdbc:mysql://awa-mysql.bjidc.com:3306/{0}?characterEncoding=utf-8&useSSL=false");
		jlb31 = new JLabel("* 数据库名,如awa_recommend/awa_base等,仅需要指定库名");
		jp3.add(jlb3);
		jp3.add(jtf3);
		jp3.add(jlb31);
		jlb4 = new JLabel("author", JLabel.RIGHT);
		jtf4 = new JTextField(10);
		jtf4.setToolTipText("编码作者");
		jlb41 = new JLabel("用于注释代码作者");
		jp4.add(jlb4);
		jp4.add(jtf4);
		jp4.add(jlb41);
		jlb5 = new JLabel("包模块", JLabel.RIGHT);
		jtf5 = new JTextField(10);
		jtf5.setToolTipText("模块：例如awa-base,取base");
		jlb51 = new JLabel("* com.huayong.awa.apollo.{0}.platform.*,用于替换生成包路径");
		jp5.add(jlb5);
		jp5.add(jtf5);
		jp5.add(jlb51);
		jlb6 = new JLabel("表名", JLabel.RIGHT);
		jtf6 = new JTextField(10);
		jtf6.setToolTipText("表名,多个表逗号隔开");
		jlb61 = new JLabel("支持多表生成,表名逗号隔开");
		jp6.add(jlb6);
		jp6.add(jtf6);
		jp6.add(jlb61);
		jlb7 = new JLabel("代码输出路径", JLabel.RIGHT);
		jtf7 = new JTextField(10);
		jtf7.setToolTipText("生成文件路径");
		jlb71 = new JLabel("例如:C:\\Users\\Administrator\\Desktop\\code,暂不支持创建目录");
		jp7.add(jlb7);
		jp7.add(jtf7);
		jp7.add(jlb71);

		jp2.setLayout(new GridLayout(1, 3));
		jp3.setLayout(new GridLayout(1, 3));
		jp4.setLayout(new GridLayout(1, 3));
		jp5.setLayout(new GridLayout(1, 3));
		jp6.setLayout(new GridLayout(1, 3));
		jp7.setLayout(new GridLayout(1, 3));

		jb1 = new JButton("执行");
		jb1.setSize(100, 65);
		jp9.add(jb1);
		jp9.setSize(200, 65);
		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Bean bean = new Bean();
				if (StringUtils.isBlank(jtf1.getText())) {
					showMessage("账户不能为空!");
					return;
				}
				bean.setAccount(jtf1.getText());

				if (StringUtils.isBlank(jtf2.getText())) {
					showMessage("密码不能为空!");
					return;
				}
				bean.setPassword(jtf2.getText());

				if (StringUtils.isBlank(jtf3.getText())) {
					showMessage("数据库不能为空!");
					return;
				}
				String url = "jdbc:mysql://awa-mysql.bjidc.com:3306/{0}?characterEncoding=utf-8&useSSL=false";
				bean.setDbUrl(MessageFormat.format(url, jtf3.getText()));
				if (StringUtils.isBlank(jtf4.getText())) {
					showMessage("作者不能为空!");
					return;
				}
				bean.setAuthor(jtf4.getText());

				if (StringUtils.isBlank(jtf5.getText())) {
					showMessage("模块不能为空!");
					return;
				}
				bean.setModule(jtf5.getText());

				if (StringUtils.isBlank(jtf6.getText())) {
					showMessage("表名不能为空!");
					return;
				}
				String names = jtf6.getText();

				String[] tableName = names.split(",");
				bean.setTableNames(Arrays.asList(tableName));
				if (StringUtils.isBlank(jtf7.getText())) {
					showMessage("生成路径不能为空!");
					return;
				}
				bean.setPath(jtf7.getText());
				try {
					AutoGeneratorCodeUtil.autoGenerate(bean);
				} catch (Exception e2) {
					showMessage("生成失败,请检查所填数据项是否正确!!!");
				}
			}
		});

		// jb2.addActionListener(new ActionListener() {
		//
		// @Override
		// public void actionPerformed(ActionEvent e) {
		// System.exit(0);
		// }
		// });

		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		this.add(jp4);
		this.add(jp5);
		this.add(jp6);
		this.add(jp7);
		this.add(jp8);

		this.add(jp9);
		this.add(jp10);

		this.setLayout(new GridLayout(10, 1));
		this.setLocation(350, 250);
		this.setSize(850, 450);
		this.setTitle("代码生成");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	private void showMessage(String msg) {
		JOptionPane.showMessageDialog(null, msg, "提示", JOptionPane.WARNING_MESSAGE);
	}

}
