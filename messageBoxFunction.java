public void messageBox(String method, String message){
      Log.d("Exception: "+method, message);
      AlertDialog.Builder messageBox = new AlertDialog.Builder(this);
      messageBox.setTitle(method);
      messageBox.setMessage(message);
      messageBox.setCancelable(false);
      messageBox.setNeutralButton("Ok",null);
      messageBox.show();
    }