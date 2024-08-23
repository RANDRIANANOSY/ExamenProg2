package ExamenProg2;

    public abstract class Location implements Place {
        private String name;
        private double latitude;
        private double longitude;
        private String description;

        public Location(String name, double latitude, double longitude, String description) {
            this.name = name;
            this.latitude = latitude;
            this.longitude = longitude;
            this.description = description;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public double getLatitude() {
            return latitude;
        }

        @Override
        public double getLongitude() {
            return longitude;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }


