/*
        try {
            reader = new BufferedReader(new FileReader(PayData));
            while ((AllLines = reader.readLine()) != null) {
                String[] row = AllLines.split(","); // makes list of words between commas
                for (String index : row) {
                    System.out.printf("%-10s", index);
                }
            }
            System.out.println();

        }catch(Exception e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch(IOException e) {
                e.printStackTrace();
            }

        }
                BufferedReader reader = null; // Initialize reader

        File NewData = new File("output.csv");
                String[] NewArray = Arrays.copyOf(OGArray, OGArray.length + 1); // make bigger array
        NewArray[NewArray.length - 1] = OGArray[]
        */