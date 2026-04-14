package Questao2;

public class CompareSubstrings {

        public static String getSmallestAndLargest(String s, int k) {

            String menor = s.substring(0, k);
            String maior = s.substring(0, k);

            int i = 0;

            while (i <= s.length() - k) {

                String sub = "";
                int j = i;

                while (j < i + k) {
                    sub = sub + s.charAt(j);
                    j = j + 1;
                }

                if (sub.compareTo(menor) < 0) {
                    menor = sub;
                }

                if (sub.compareTo(maior) > 0) {
                    maior = sub;
                }

                i = i + 1;
            }

            String resultado = menor + "\n" + maior;
            return resultado;
        }
    }

