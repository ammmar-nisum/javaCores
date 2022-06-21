public class Processor {
        private String numberOfThreads;
        private String brand;
        private String series;

        public Processor() {
                this.numberOfThreads = "2000";
                this.brand = "intel";
                this.series = "240";
        }

        public Processor(String numberOfThreads, String brand, String series) {
                this.numberOfThreads = numberOfThreads;
                this.brand = brand;
                this.series = series;
        }

        public String getNumberOfThreads() {
                return numberOfThreads;
        }

        public String getBrand() {
                return brand;
        }

        public String getSeries() {
                return series;
        }

        @Override
        public String toString() {
                return "Processor{" +
                        "numberOfThreads='" + numberOfThreads + '\'' +
                        ", brand='" + brand + '\'' +
                        ", series='" + series + '\'' +
                        '}';
        }
}
