package task04.task0401.database;

public class TargetData {
        private String targetDestination;
        private String targetDayOfWeek;
        private String targetTime;

        public String getTargetDestination() {
                return targetDestination;
        }

        public void setTargetDestination(String targetDestination) {
                this.targetDestination = targetDestination;
        }

        public String getTargetDayOfWeek() {
                return targetDayOfWeek;
        }

        public void setTargetDayOfWeek(String targetDayOfWeek) {
                this.targetDayOfWeek = targetDayOfWeek;
        }

        public String getTargetTime() {
                return targetTime;
        }

        public void setTargetTime(String targetTime) {
                this.targetTime = targetTime;
        }

        @Override
        public String toString() {
                return String.format("[Target data] \tDestination: %s; \tDay: %s; \tTime: %s.",
                        this.targetDestination, targetDayOfWeek, this.targetTime);
        }

        public void initData(){
                int randomSelection = (int) (Math.random() * Database.destinations.length);
                targetDestination = Database.destinations[randomSelection];

                randomSelection = (int) (Math.random() * Database.dayOfWeek.length);
                targetDayOfWeek = Database.dayOfWeek[randomSelection];

                randomSelection = (int) (Math.random() * Database.timeOfFlight.length);
                targetTime = Database.timeOfFlight[randomSelection];
        }

        public void printData() {
                System.out.println(this);
        }


}
