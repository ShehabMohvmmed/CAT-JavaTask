public  class Result {
    private boolean isValid;
    private String message;

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public void setMessage(String m) {
        this.message = m;
    }

    public boolean isValid() {
        return isValid;
    }

    public String getMessage() {
        return this.message;
    }


}
