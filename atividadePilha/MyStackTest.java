import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MyStackTest
{
    @Test
    void pilhaDeveIniciarVazia()
    {
        MyStack pilha = new MyStack();
        assertTrue(pilha.isEmpty());
    }

    @Test
    void pushDeveInserirElemento()
    {
        MyStack pilha = new MyStack();

        pilha.push("A");

        assertEquals("A", pilha.peek());
    }

    @Test
    void popDeveRemoverTopo()
    {
        MyStack pilha = new MyStack();

        pilha.push("A");
        pilha.push("B");

        assertEquals("B", pilha.pop());
        assertEquals("A", pilha.peek());
    }

    @Test
    void peekNaoDeveRemoverElemento()
    {
        MyStack pilha = new MyStack();

        pilha.push("A");

        assertEquals("A", pilha.peek());
        assertEquals("A", pilha.peek());
    }

    @Test
    void pilhaDeveSeguirLifo()
    {
        MyStack pilha = new MyStack();

        pilha.push("A");
        pilha.push("B");
        pilha.push("C");

        assertEquals("C", pilha.pop());
        assertEquals("B", pilha.pop());
        assertEquals("A", pilha.pop());
    }

    @Test
    void popEmPilhaVaziaDeveRetornarNull()
    {
        MyStack pilha = new MyStack();

        assertNull(pilha.pop());
    }

    @Test
    void peekEmPilhaVaziaDeveRetornarNull()
    {
        MyStack pilha = new MyStack();

        assertNull(pilha.peek());
    }
}
