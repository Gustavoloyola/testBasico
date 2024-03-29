package org.example.fundamentosProgramacion;

public class Rectangulo {

        private int base;
        private int altura;


        public Rectangulo( int base, int altura) {

            this.base = base;
            this.altura = altura;

        }

        public int getBase() {
            return base;
        }

        public void setBase(int base) {
            this.base = base;
        }

        public int getAltura() {
            return altura;
        }

        public void setAltura(int altura) {
            this.altura = altura;
        }



        public String toString() {
            return "Rectangulo{" +
                    "base=" + base +
                    ", altura=" + altura +
                    '}';
        }



        public double calcularArea() {
            return base*altura;
        }


        public double calcularPerimetro() {
            return (base*2)+(altura*2);
        }
    }

