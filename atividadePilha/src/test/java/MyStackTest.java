import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.EmptyStackException;

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
    void popEmPilhaVaziaDeveRetornarExeption()
    {
        MyStack pilha = new MyStack();

        assertThrows(
                EmptyStackException.class,
                () -> pilha.pop());
    }

    @Test
    void peekEmPilhaVaziaDeveRetornarExeption()
    {
        MyStack pilha = new MyStack();
        assertThrows(
                EmptyStackException.class,
                () -> pilha.peek());
    }

    @Test
    void pushNDeveAceitarNulo(){
        MyStack pilha = new MyStack();

        assertThrows(
            IllegalArgumentException.class, () -> pilha.push(null));
    }
}
