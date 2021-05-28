import javax.swing.*;  
import javax.swing.tree.*;  
public class jtree extends JFrame{  
  
   jtree(){  
      
    DefaultMutableTreeNode world=new DefaultMutableTreeNode("World");  
    DefaultMutableTreeNode southkorea=new DefaultMutableTreeNode("southkorea");  
    DefaultMutableTreeNode Asia=new DefaultMutableTreeNode("Asia");  
    world.add(southkorea);  
    world.add(Asia);  
    DefaultMutableTreeNode BTS=new DefaultMutableTreeNode("BTS");  
    DefaultMutableTreeNode seoul=new DefaultMutableTreeNode("seoul");  
    DefaultMutableTreeNode India=new DefaultMutableTreeNode("India");  
    DefaultMutableTreeNode jejuisland=new DefaultMutableTreeNode("jejuisland");  
    southkorea.add(BTS); 
	southkorea.add(seoul); 
	Asia.add(India); 
	Asia.add(jejuisland);      
    JTree jt=new JTree(world);  
    add(jt);  
    setSize(200,200);  
    setVisible(true);  
}  
public static void main(String[] args) {  
    new jtree();  
}
}  
