
              String email = encodeUserEmail(UserEmail);
              databaseReference = FirebaseDatabase.getInstance().getReference().child(email);


               private void UserExits(String userEmail) {
                databaseReference.addValueEventListener(new ValueEventListener() {

                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        if (dataSnapshot.exists()) {

                 //do your stuff

                            });
            }

        }
        }


        //email address encode
            static String encodeUserEmail(String userEmail) {
                return userEmail.replace(".", ",");
            }


        //email address decode
            static String decodeUserEmail(String userEmail) {
                return userEmail.replace(",", ".");
            }
