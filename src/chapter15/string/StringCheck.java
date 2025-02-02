package chapter15.string;

public class StringCheck {
    public static void main(String[] args) {
        StringCheck sample = new StringCheck();

        String addresses[] = new String[]{
                "서울시 구로구 신도림동",
                "경기도 성남시 분당구 정자동",
                "서울시 구로구 개봉동"
        };
//        sample.checkAddress(addresses);
//        sample.containsAddress(addresses);
//        sample.checkMatch();
//        sample.checkIndexOf();
//        sample.checkSubString();
//        sample.checkSplit();


        sample.internCheck();
    }

    public void checkAddress(String[] addresses) {
        int startCount = 0, endCount = 0;
        String startText = "서울시";
        String endText = "동";
        for (String address : addresses) {
            if (address.startsWith(startText)) {
                startCount++;
            }
            if (address.endsWith(endText)) {
                endCount++;
            }
        }
        System.out.println("Starts with " + startText + " count is " + startCount);
        System.out.println("Ends with " + endText + " count is " + endCount);
    }

    public void containsAddress(String[] addresses) {
        String checkText = "구로구";
        int containsCount = 0;
        for (String address : addresses) {
            if (address.contains(checkText)) {
                containsCount++;
            }
        }
        System.out.println("Contains " + checkText + " count is " + containsCount);
    }

    public void checkMatch() {
        String text = "This is a text";
        String compare1 = "is";
        String compare2 = "this";
        System.out.println(text.regionMatches(2, compare1, 0, 1));
        System.out.println(text.regionMatches(5, compare1, 0, 1));
        System.out.println(text.regionMatches(true, 0, compare2, 0, 4));
    }

    public void checkIndexOf() {
        String text = "Java technology is both a programming language and a platform.";
        System.out.println(text.indexOf('a'));
        System.out.println(text.indexOf("a "));
        System.out.println(text.indexOf('a', 20));
        System.out.println(text.indexOf("a ", 20));
        System.out.println(text.indexOf('z'));
        System.out.println(text.lastIndexOf('a'));
        System.out.println(text.lastIndexOf("a "));
        System.out.println(text.lastIndexOf('a', 20));
        System.out.println(text.lastIndexOf("a ", 20));
        System.out.println(text.lastIndexOf('z'));
    }

    public void checkSubString() {
        String text = "Java technology";
        String technology = text.substring(5);
        System.out.println(technology);

        String tech = text.substring(5, 9);
        System.out.println(tech);
    }

    public void checkSplit() {
        String text = "Java technology is both a programming language and a platform.";
        String[] splitArray = text.split(" ");
        for (String temp : splitArray) {
            System.out.println(temp);
        }
    }

    public void checkTrim() {
        String[] data = {
                "abc  ",
                "  abc",
                "  abc  ",
                "  a bc  ",
                "  a  b  c  "
        };
        for (String tempData : data) {
            System.out.println(">" + tempData + "<");
            System.out.println(">" + tempData.trim() + "<");
        }
    }

    public void checkTrim2() {
        String text = " a ";
        if (text != null && text.trim().length() > 0) {
            System.out.println("OK");
        }
    }

    public void checkReplace() {
        String text = "The String class represents character strings.";
        System.out.println(text.replace('s', 'z'));
        System.out.println(text);
        System.out.println(text.replace("tring", "trike"));
        System.out.println(text.replaceAll(" ", "|"));
        System.out.println(text.replaceFirst(" ", "|"));
    }

    public void checkFormat() {
        String text = "제 이름은 %s입니다. 지금까지 %d권의 책을 썼고, "
                + "하루에 %f%%의 시간을 쓰고 있습니다.";
        String realText = String.format(text, "이상민", 3, 10.5);

        System.out.println(realText);
    }

    public void internCheck() {
        String text1 = "Java Basic";
        String text2 = "Java Basic";
        String text3 = new String("Java Basic");
        text3 = text3.intern();
        System.out.println(text1 == text2);
        System.out.println(text1 == text3);
        System.out.println(text1.equals(text3));
    }

    public void stringBuilder() {
        StringBuilder builder = new StringBuilder();
        builder.append("I");
        builder.append(" go");
        builder.append(" to school.");
        System.out.println(builder.toString());
    }
}
