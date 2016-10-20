    class MySumTask extends AsyncTask<Integer,Integer,Integer>
    {
        @Override
        protected void onPreExecute() {
            Toast.makeText(MainActivity.this, "onPreExucute", Toast.LENGTH_SHORT).show();
           // super.onPreExecute();
        }

        @Override
        protected Integer doInBackground(Integer... integers) {
            //All the BackGround work goes here
            int n = integers[0];
            int sum = 0;
            for (int i = 1;i <= n;i++){
                sum +=i;

                publishProgress(i,n);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return sum;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            int i = values[0];
            int n = values[1];
            double percentage = ((double)i/(double)n)*100;
            Toast.makeText(MainActivity.this, ""+percentage, Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onPostExecute(Integer integer) {
            super.onPostExecute(integer);
            textView.setText("S(n) ="+integer);
        }
    }
