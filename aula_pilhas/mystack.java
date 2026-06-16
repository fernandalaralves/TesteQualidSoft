public class mystack {
        private Node first = null;

        private class Node{
            String item;
            Node next;
        }

        public boolean isEmpty()
        {
            return first == null;
        }

        public void push(String s)
        {
            Node p = new Node();

            p.itm = s;

            p.next = first;

            first = p;
        }

        public String pop()
        {
            if(isEmpty())
            {
                System.err.println("pilha vazia");
            }
            String s = first.item;
           first =  first.next;
           return s;
        }

        public String peek(){
            if(isEmpty())
            {
                System.out.println("pilha vazia");
            }
            return first.item;
        }
        public void print()
        {
            Node p;

            for(p = first; p != null; p= p.next)
                System.out.printf("%s ->", p.item);
               System.out.printf("null.\n");
        }
}