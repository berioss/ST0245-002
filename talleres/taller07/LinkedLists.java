public class LinkedLists
{
    private Abeja first;
    private int n = 0;
    public void append(int cx, int cy){
        this.n++;
        if(first == null){
            first = new Abeja(cx,cy);
            return;
        }
        Abeja pos = first;
        while(pos.next != null){
            pos = pos.next;
        }
        pos.next = new Abeja(cx, cy);
    }

    public void insert(int index, int cx, int cy){
        if(index < 1 || index > this.n){
            throw new IndexOutOfBoundsException("Index: "+ index);
        }
        else if(index == 1){
            newFirst(cx, cy);
            return;
        }
        else if(index == n+1){
            append(cx,cy);
            return;
        }
        Abeja pos = first;
        int cont = 1;
        while(pos.next != null){
            if(cont+1 == index){
                Abeja temp = pos.next;
                pos.next = new Abeja(cx,cy);
                pos.next.next = temp;
                n++;
                return;
            }
            pos = pos.next;
            cont++;
        }
    }

    public void newFirst(int cx, int cy){
        Abeja newFirst = new Abeja(cx, cy);
        newFirst.next = first;
        first = newFirst;
        this.n++;
    }

    public void delete(int cx, int cy){
        if(first == null)
            return;
        else if(first.x == cx && first.y == cy){
            first = first.next;
            n--;
            return;
        }

        Abeja pos = first;
        while(pos.next != null){
            if(pos.next.x == cx && pos.next.y == cy){
                pos.next = pos.next.next;
                n--;
                return;
            }
            pos = pos.next;
        }
    }

    public void search(int cx, int cy){
        Abeja pos = first;
        for(int i = 0; i < n; i++){
            if(pos.x == cx && pos.y == cy){
                System.out.println("Se encuentra en la posicion "+(i+1));
                return;
            }
            pos = pos.next;
        }
        System.out.println("La abeja no se encuentra registrada con tales coordenadas");
    }
}