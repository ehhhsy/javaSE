package Demo07;
   /*
    * 自己练习
    */
public class Demo09zixi {

      public void prinlsometing(String name){
         System.out.println(this.name+"战胜了"+name+",  ");
      }

      private String name;
      private int age;

      public Demo09zixi(String name, int age) {
         this.name = name;
         this.age = age;
      }

      public Demo09zixi() {
      }


      public String getName() {
         return name;
      }

      public void setName(String name) {
         this.name = name;
      }

      public int getAge() {
         return age;
      }

      public void setAge(int age) {
         this.age = age;
      }

      /* private String name;
        private int age;
        public Demo09zixi() {
        	
        }
        public Demo09zixi(String name,int age) {
        	this.age=age;
        	this.name=name;
        }
        public void getName(String name) {
        	this.name=name;
        }
        public String setName() {
        	return name;
        }
        public void getAge(int age) {
        	this.age=age;
        }
        public int setage() {
        	return age;
        }
		public void pirnltn () {
			System.out.println("2020.7.20");
		}
        */
}
