
        import java.lang.*;
        import java.io.*;

        class Student {
            String name;
            String lastName;

            Student(String name, String lastName) {
                this.name = name;
                this.lastName = lastName;
            }
        }
        public class Main {

                public static void main(String args[]) throws java.lang.Exception {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

                    System.out.print("N = ");

                    int N = Integer.parseInt(reader.readLine());

                    System.out.println();

                    int sum = 0;

                    for (int i = 0; i < N; i++) sum += Integer.parseInt(reader.readLine());

                    System.out.println((double) sum / N);


                }
        }