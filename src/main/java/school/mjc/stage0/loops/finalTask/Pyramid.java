package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
if (cathetusLength>0){
    String space="";
    String output="";
    for (int i=0;i<cathetusLength-1;i++){
        space=space+" ";
    }
    int row=1;
    for (int i=0;i<cathetusLength;i++){
        output+=space;
        for(int j=0;j<row;j++){
            output+=(row-j);
        }
        for(int j=row;j>1;j--){
            output+=(row-(j-2));
        }
        output+="\n";
        row=row+1;
        if(space.length()>0) {
            space = space.substring(0, (space.length() - 1));
        }
    }
    System.out.println(output);
}

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
