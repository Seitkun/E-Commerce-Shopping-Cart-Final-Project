    public class SmartPhone implements Product{
        private final String model;
        private final String color;
        private final int storage;

        private SmartPhone(PhoneBuilder b){
            this.model=b.model;
            this.color=b.color;
            this.storage=b.storage;

        }
        @Override
        public String getname(){
            return model;
        }
        @Override
        public void show(){
            System.out.println(
                    "Smartphone"+"\n model "+model+"\n color "+color+"\n storage "+storage
            );
        }
        public static class PhoneBuilder{

            private String model="Standart";
            private String color="black";
            private int storage=64;

            public PhoneBuilder setModel(String m){
                this.model=m;
                return this;
            }
            public PhoneBuilder setColor(String c){
                this.color=c;
                return this;
            }
            public PhoneBuilder setStorage(int s){
                this.storage=s;
                return this;
            }
            public Product build(){
                return new SmartPhone(this);
            }
        }

    }
