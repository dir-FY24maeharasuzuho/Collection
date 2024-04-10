package sample;

public class MultiArraySample {

    public static void main(String[] args) {
        var matrix = new int[3][4]; //3×4の2次元配列
        
        //2次元配列へのアクセスと代入
        for(var i = 0; i < matrix.length; i++) { //行数 
            for(var j = 0; j< matrix[i]. length; j++) { //列数
                matrix[i][j]= i*3+j+1; //値の代入（「i行j列」の要素に「i*3+j+1」の結果を代入）
            }
        }
        
        //2次元配列の要素を表示
        for(var i = 0; i < matrix.length; i++) {
            for(var j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]+ " ");
            }
            System.out.println();
        }

    }

}
