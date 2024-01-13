package HomeWorkOOP;

import HomeWorkOOP.Man;

public class Student extends Man {
        private int yearOfStudy;

        public void setYearOfStudy(int yearOfStudy) {
            this.yearOfStudy = yearOfStudy;
        }

        public int getYearOfStudy() {
            return yearOfStudy;
        }

        public void increaseYearOfStudy() {
            this.yearOfStudy++;
        }
    }
