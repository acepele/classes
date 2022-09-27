class Contacts(var contactID: Int, var EmployeeName: String?, var EmployeeNumber: Int, var EmployeeShift: Int) {
    fun printAll() {
        println(
            contactID.toString() + "\nEmployee Name: " + EmployeeName + 
                    "\nEmployee Number: " + EmployeeNumber + "\nEmployee Shift: " + EmployeeShift
        )
    }
}
