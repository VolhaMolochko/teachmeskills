package lesson11homework;

public class CustomArrayList {
    private Object[] massiv;
    private int size = 0;


    public CustomArrayList() {
        this.massiv = new Object[10];
        this.size = size;
    }

    public CustomArrayList(Object massiv, int size) {
        this.massiv = new Object[10];
        this.size = size;
    }

    public int size() {
        return size;
    }

    private void expandMassiv() {
        Object[] newMassiv = new Object[massiv.length * 2];
        System.arraycopy(massiv, 0, newMassiv, 0, massiv.length);
        massiv = newMassiv;
    }

    public void addElement(Object element) { //увеличение размера массива
        if (size == massiv.length) {
            expandMassiv();
        }
        massiv[size] = element;
        size++;
    }

    public void deleteElement(int index) { //удаление элемента
        for (int i = index; i < size; i++) {
            massiv[i] = massiv[i + 1];
        }
        massiv[size - 1] = null;
        size--;
    }

    public Object get(int index) {
        return massiv[index];
    }

    public boolean contains(Object element) { //проверяем содержится ли элемент
        for (int i = 0; i < size; i++) {
            if (massiv[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public void empty() {    //обнуляем массив
        for (int i = 0; i < size; i++) {
            massiv[i] = null;
        }
        size = 0;
    }


}