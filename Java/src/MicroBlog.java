class MicroBlog {
    public String truncate(String input) {
        if (input.length() > 4){
            int truncated = input.offsetByCodePoints(0, 5);
            return input.substring(0, truncated);
        } else {
            return input;
        }
    }
}
