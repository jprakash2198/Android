    class MySumTask extends AsyncTask<Void,Void,Void>
    {
        @Override
        protected void onPreExecute() {
           // code for initializing variables before execution
           // super.onPreExecute();
        }

        @Override
        protected Integer doInBackground(Void... integers) {
            //All the BackGround work goes here
          
               
             return null;
        }

        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
            // pass data here for progress values
        }

        @Override
        protected void onPostExecute(Void integer) {
            super.onPostExecute(integer);
          // return the result
        }
    }
