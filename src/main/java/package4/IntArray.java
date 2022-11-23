package package4;

import java.util.Arrays;
import java.util.Objects;

public class IntArray implements ArrayInterface{
    private int[] ints = new int[sizeArray/32];
    @Override
    public boolean getByIndex(int Index) {
        if (Index<0 || Index >=sizeArray ) return false;
        int indexElement = Index/32;
        int element = ints[indexElement];
        int indexBit = Index%32;
        int mask = 1<<indexBit;// Смещение
        return (element& mask) == mask;// если результат равен маске значит там содержится единица
    }
    @Override
    public void setTrue(int Index) {
        if (Index>=0 || Index <sizeArray );
        int indexElement = Index/32;
        int indexBit = Index%32;
        int mask = 1<<indexBit;// Смещение
        ints[indexElement]= ints[indexElement] | mask;
    }

    @Override
    public boolean getInversion(int Index) {// Метон инвертирующий элемент с заданным индексом
        int indexElement = Index/32;
        int indexBit = Index%32;
        int mask = 1<<indexBit;// Смещение
        ints[indexElement]= ints[indexElement] ^ mask;
        return false;
    }

    @Override
    public int hasTrue() {// метод для подсчета true/ не работает
        int count = 0;
        String[] lines1 = new String[sizeArray];
        for (int i=0; i<sizeArray; i++){
            lines1[i] = Objects.toString( getByIndex(i)? 1:0);
            if (getByIndex(i) == true)
                ++count;
        }
        return count;
    }


    @Override
    public void setFalse(int Index) {
        if (Index<0 || Index >=sizeArray );
        int indexElement = Index/32;
        int indexBit = Index%32;
        int mask = 1<<indexBit;// Смещение
        ints[indexElement]= ints[indexElement] ^ mask;
    }

    public String toString() {
        String[] lines = new String[sizeArray];
        for (int i=0; i<sizeArray; i++){
            lines[i] = Objects.toString( getByIndex(i)? 1:0);
            // lines[i] = getByIndex(i) ? 1+"":0+"";// Альтернатива предыдущей строке
        }
        return Arrays.toString(lines);
    }
}