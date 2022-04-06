public class Calc {

    public double multiply(double a, double b){
        return (a * b);
    }

   /** Try with a bug, just remove comments and add a comment on multiply above

    public double multiply(double a, double b){
        return (a - b);
    }
    **/

    public  double powerOf(double a, double b) {
        double answer = a;

        if (b == 0) {
        answer = 1;
        return answer;

        } else {
            for(int i = 1; i< b; i++) {
            answer *=a;
            }
         return answer;
        }
    }
}
