public class Main {





        public static void main(String[] args) {

            LinkNode Cleveland = new LinkNode();

            String number;

           LinkNode.Node l1 = new Node("Roz", "01", "2.73");

            LinkNode.Node l2 = new Node("Wes", "02", "2.67");

            LinkNode.Node l3;
            l3 = new Node("Todd", "03", "2.93");


            Cleveland.insert(l1);

            Cleveland.insert(l2);

            Cleveland.insert(l3);



            while (Cleveland.i.hasNext()) {

                System.out.println(Cleveland.i.next());

            }

            Cleveland.i.reset();;

            while (Cleveland.i.hasNext()){

                l1 = Cleveland.i.next();

                number = l1.getStudentID();

                number = "S0000" + number;

                l1.setStudentID(number);

                Cleveland.i.set(l1);

            }

            Cleveland.i.reset();

            while(Cleveland.i.hasNext()) {

                System.out.println(Cleveland.i.next());

            }

            System.exit(0);

        }

    }

