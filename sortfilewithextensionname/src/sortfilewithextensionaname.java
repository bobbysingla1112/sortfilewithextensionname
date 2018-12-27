import java.io.*;
        import java.util.*;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class sortfilewithextensionaname {
    public static Pattern p;
    public static void main(String a[]) {
        File file = new File("c:/Directory/");
        String[] files = file.list(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(".sql");
            }
        });
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < files.length; i++) {
            list.add((files[i]));
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                p = Pattern.compile("\\d+");
                Matcher m = p.matcher(o1);
                if (!m.find()) {
                    return o1.compareTo(o2);
                } else {
                    String group = m.group();
                    Integer num1 = Integer.parseInt(group);
                    Matcher m2 = p.matcher(o2);
                    if (!m2.find()) {
                        return o1.compareTo(o2);
                    }
                    String group2 = m2.group();
                    Integer num2 = Integer.parseInt(group2);

                    int tmp = num1.compareTo(num2);
                    if (tmp != 0) {
                        return tmp;
                    } else {
                        return o1.compareTo(o2);
                    }
                }
            }
        });
        System.out.println(list);



        String[] files1 = file.list(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(".txt");
            }
        });
        List<String> list1 = new ArrayList<String>();
        for (int i = 0; i < files1.length; i++) {
            list1.add((files1[i]));
        }
        Collections.sort(list1, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                p = Pattern.compile("\\d+");
                Matcher m = p.matcher(o1);
                if (!m.find()) {
                    return o1.compareTo(o2);
                } else {
                    String group = m.group();
                    Integer num1 = Integer.parseInt(group);
                    Matcher m2 = p.matcher(o2);
                    if (!m2.find()) {
                        return o1.compareTo(o2);
                    }
                    String group2 = m2.group();
                    Integer num2 = Integer.parseInt(group2);

                    int bool = num1.compareTo(num2);
                    if (bool != 0) {
                        return bool;
                    } else {
                        return o1.compareTo(o2);
                    }
                }
            }
        });
        System.out.println(list1);







        String[] files2 = file.list(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(".pdf");
            }
        });
        List<String> list2 = new ArrayList<String>();
        for (int i = 0; i < files2.length; i++) {
            list2.add((files2[i]));
        }
        Collections.sort(list2, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                p = Pattern.compile("\\d+");
                Matcher m = p.matcher(o1);
                if (!m.find()) {
                    return o1.compareTo(o2);
                } else {
                    String group = m.group();
                    Integer num1 = Integer.parseInt(group);
                    Matcher m2 = p.matcher(o2);
                    if (!m2.find()) {
                        return o1.compareTo(o2);
                    }
                    String group2 = m2.group();
                    Integer num2 = Integer.parseInt(group2);

                    int bool = num1.compareTo(num2);
                    if (bool != 0) {
                        return bool;
                    } else {
                        return o1.compareTo(o2);
                    }
                }
            }
        });
        System.out.println(list2);




    }
}


