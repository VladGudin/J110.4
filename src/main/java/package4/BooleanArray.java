package package4;
import java.util.Arrays;
import java.util.Objects;
public class BooleanArray implements ArrayInterface{
    private boolean[] booleans = new boolean[sizeArray];

    @Override
    public boolean getByIndex(int Index) throws IllegalArgumentException {
      if (Index<0 || Index >=sizeArray ){throw new  IllegalArgumentException("Значение несоответствует интервалу");
      } else
        return booleans[Index];
    }

    @Override
    public void setTrue(int Index) {
        booleans[Index] =true;
    }

    @Override
    public boolean getInversion(int Index) {
       if (booleans[Index]=true){
        return true;
       }else return false;
    }

    @Override
    public int hasTrue() {// метод для подсчета true/ не работает
        int count = 0;
        for (boolean b : booleans) {
            if (b) ++count;
        }
        return count;
    }

    @Override
    public void setFalse(int Index) {
        booleans[Index] =false;
    }

    @Override
    public String toString() {
        String[] lines1 = new String[sizeArray];
        for (int i=0; i<sizeArray; i++){
            lines1[i] = Objects.toString( getByIndex(i)? 1:0);
        }
        return Arrays.toString(lines1);
        }
    }
