public class FilmsManager {
    private final int limit;
    private String[] Films = new String[0];

    public FilmsManager() {

        this.limit = 5;
    }

    public void add(String movieI) {
    }

    public String[] findLast() {
        return new String[0];
    }

    public String[] findALL() {
        return new String[0];
    }

    public class FilmsManagerEquals {
        private final int limit;
        private String[] Films = new String[5];

        public FilmsManagerEquals() {

            this.limit = 5;
        }

        public class FilmsManagerLess {
            private final int limit;
            private String[] Films = new String[4];

            public FilmsManagerLess() {

                this.limit = 5;
            }

            public class FilmsManagerMore {
                private final int limit;
                private String[] Films = new String[6];

                public FilmsManagerMore() {

                    this.limit = 5;
                }

                public void add(String films) {

                    String[] tmp = new String[Films.length + 1];

                    System.arraycopy(Films, 0, tmp, 0, Films.length);
                    tmp[tmp.length - 1] = films;
                    this.Films = tmp;
                }

                public String[] findALL() {
                    return Films;
                }

                public String[] findLast() {
                    int resultLength = Math.min(Films.length, limit);
                    String[] tmp = new String[resultLength];
                    for (int i = 0; i < tmp.length; i++) {
                        tmp[i] = Films[Films.length - 1 - i];
                    }
                    return tmp;
                }
            }
        }
    }
}
