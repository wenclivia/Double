import java.lang.invoke.WrongMethodTypeException;

//提供双向链表实现类
public class DoubleLinkedTable{
    DupNode head;//头节点
    public DoubleLinkedTable(){
        head=new DupNode();
        head.prior=head;
        head.next=head;
    }

    //提供长度，打印，清空等方法
    public int length(){
        DupNode node=head.next;
        int j=0;
        while(!node.equals(head)){
            j++;
            node=node.next;
        }
        return j;
    }
    public void display(){
        DupNode node=head.next;
        while(!node.equals(head)){
            System.out.println(node.object);
            node=node.next;
        }
    }
    public void clear(){
        head.next=head;
        head.prior=head;
    }
    //提供下标插入方法
    public void insert(int i,Object object) throws Exception{
        //throws表示出现异常的可能性
        if(i<0||i>length())
            throw new Exception("下标不合法");
        DupNode node =head;
        int j=0;
        while(!node.next.equals(head)&&j<i){
            j++;
            node=node.next;
        }
        DupNode newNode=new DupNode(object,node,node.next);
        node.next.prior=newNode;
        node.next=newNode;
    }
    //remove
    public void remove(int i)throws Exception{
        if(i<0||i>length()-1)
            throw new Exception("下标不合法");
        DupNode node=head;
        int j=0;
        while(!node.next.equals(head)&&j<i){
            j++;
            node=node.next;
        }
        node.next=node.next.next;
        node.next.prior=node;
    }

}
