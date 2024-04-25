document.addEventListener('DOMContentLoaded', function () {
    const urlParams = new URLSearchParams(window.location.search);

    function displayMessage() {
        if (urlParams.has("SuccessAddingMerchant")) {
            alert("Merchant added successfully!");
        }

        if(urlParams.has("RoleAdded")){
            alert("Role Added Successfully!");
        }

        if(urlParams.has("RoleAddedFailed")){
            alert("New Role Adding Failed! Role May Already Exist.");
        }

        if(urlParams.has("RoleUpdated")){
            alert("Role Update Successful.");
        }

        if(urlParams.has("RoleUpdateFailed")){
            alert("Role Update Failed! Role May Already Exist.");
        }

        if(urlParams.has("RoleDeleted")){
            alert("Role Deleted Successfully.");
        }

        if(urlParams.has("RoleDeleteFailed")){
            alert("Role Delete Failed! Something went wrong.");
        }

        if(urlParams.has("UserAddSuccess")){
            alert("New User Added!");
        }

        if(urlParams.has("UserAddFailed")){
            alert("New User Adding Failed! User Maybe Already Registered");
        }

        if(urlParams.has("UserUpdateSuccess")){
            alert("User Information Updated!");
        }

        if(urlParams.has("UserUpdateFailed")){
            alert("User Information Update Failed! Something went wrong.");
        }

        if(urlParams.has("UserDeleteSuccess")){
            alert("User Removed!");
        }

        if(urlParams.has("UserDeleteFailed")){
            alert("Failed to Remove User! Something went wrong.");
        }

        if(urlParams.has("WrongMerchantNumber")){
            alert("Failed to Transfer amount! Please Check Merchant Mobile No.");
        }

        if(urlParams.has("MerchantError")){
            alert("Merchant session maybe expired, Please login again!");
        }

        if(urlParams.has("NotAdmin")){
            alert("Failed to Transfer amount! Admin session maybe expired, please login again.");
        }

        if(urlParams.has("AdminNotFound")){
            alert("Failed to Transfer amount! Admin not Found.");
        }

        if(urlParams.has("InvalidAmount")){
            alert("Failed to Transfer amount! Amount is Larger than Due");
        }

        if(urlParams.has("success")){
            alert("Transaction successful");
        }

        if(urlParams.has("ErrorFindingTransaction")){
            alert("Failed :: Transaction Not Found!");
        }

        if(urlParams.has("AlreadyApproved")){
            alert("Failed :: The Transaction is Already Approved!");
        }

        if(urlParams.has("ApprovalSuccess")){
            alert("Success ! The Transaction is Approved!");
        }

        if(urlParams.has("ToPendingSuccess")){
            alert("Success ! The Transaction is Changed to Pending!");
        }

        if(urlParams.has("RejectSuccess")){
            alert("Success ! The Transaction is Rejected!");
        }

        if(urlParams.has("ErrorTransaction")){
            alert("Failed ! Something went wrong!");
        }

        if(urlParams.has("NoMerchantFound")){
            alert("Failed ! No Merchant was not found with this number.");
        }

        if(urlParams.has("NotAMerchant")){
            alert("Failed ! This user is not a Merchant.");
        }

        if(urlParams.has("UpdateSuccess")){
            alert("Success ! Merchant was Successfully updated.");
        }

        if(urlParams.has("RemoveSuccess")){
            alert("Merchant was removed!");
        }

        if(urlParams.has("NoOrderFound")){
            alert("Failed ! No Order Found with This Id!");
        }

        if(urlParams.has("NoBedAvailable")){
            alert("Failed ! No Available Bed");
        }

        if(urlParams.has("orderApproved")){
            alert("Success ! Order S Approved");
        }

        if(urlParams.has("orderRejected")){
            alert("Success ! Order Rejected");
        }

        if(urlParams.has("orderToPending")){
            alert("Success ! Order Changed to Pending");
        }
    }

    // Call the displayMessage function to trigger the alert
    displayMessage();

});