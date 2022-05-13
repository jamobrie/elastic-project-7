public class Static {

    public void main(String[] args) {
        staticChild staticChild = new staticChild();
        nonStaticParent nonStaticParent = new nonStaticParent();

    }

    public static class staticChild{

    }

    public static class staticParent{

    }

    public class nonStaticChild extends nonStaticParent {

    }

    public class nonStaticParent{

    }

}
