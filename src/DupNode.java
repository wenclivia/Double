//提供节点类
public class DupNode {
    Object object;
    DupNode prior;//前
    DupNode next;//后

    public DupNode() {
        this(null);
    }

    public DupNode(Object object) {
        this(object, null, null);
    }

    public DupNode(Object object,DupNode prior,DupNode next) {
        this.object = object;
        this.prior = prior;
        this.next = next;
    }
}



