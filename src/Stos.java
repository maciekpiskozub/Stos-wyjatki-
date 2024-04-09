import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stos {
    private ArrayList<Integer> elementy = new ArrayList<>();
    private int pojemnosc;



    public Stos(final int pojemnosc) {
        if(pojemnosc < 0) {
            throw new IllegalArgumentException("Pojemnosc nie moze byc mniejsza od 0");
        }
        this.pojemnosc = pojemnosc;
    }

    public void push(int liczba) throws StackFullException {
        if(elementy.size() < pojemnosc) {
            elementy.add(liczba);
        } else {
            throw new StackFullException();
        }


    }
    public int pop() {
        if(!elementy.isEmpty()) {
            return elementy.removeLast();
        } else {
            throw new EmptyStackException();
        }
    }

    public void cler() {
        elementy.clear();
    }

    public int top() {
        if(!elementy.isEmpty()) {
            return elementy.get(elementy.size()-1);
        } else {
            throw new EmptyStackException();
        }
    }

    public int size() {
        return elementy.size();
    }

}
