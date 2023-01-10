package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {

/*        String word = new String(chars);
        System.out.print(word);*/

        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (i < chars.length) {
            stringBuilder.append(chars[i]);
            i++;
        }
        String word = stringBuilder.toString();
        System.out.print(word);

    }
}
