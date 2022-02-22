import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Anubhav
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        Code1 solver = new Code1();
        solver.solve(1, in, out);
        out.close();
    }

    static class Code1 {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int t = 100000; //number of games we are going to analyze;
            int stay = 0;
            int ff=t;
            int swap = 0;
            while (t-- > 0) {
                int car = (int) ((Math.random() * 3) + 1); //Randomly selected door number of car
                int chosen = (int) ((Math.random() * 3) + 1); //randomly selected door number chosen at first
                //if chosen and car same then staying is the nest option
                if (car == chosen)
                    stay++;
                    //if chosen is not same as then swapping is best option;
                else
                    swap++;
            }
            double tt = ff;
            out.println(tt);
            double st = stay;
            double sw = swap;
            out.print("Stay: count "+(stay)+"=");
            out.println((st / tt)*100);
            out.print("Swap: count "+(swap)+"=");
            out.println((sw / tt)*100);
        }

    }

    static class InputReader {
        private InputStream stream;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void println(Object... objects) {
            print(objects);
            writer.println();
        }

        public void close() {
            writer.close();
        }

    }
}

