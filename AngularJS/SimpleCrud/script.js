var module = angular.module('app', []);

module.service('ContactService', function () {
    //to create unique contact id
    var uid = 2;
    
    //contacts array to hold list of all contacts
    var contacts = [{
        id: 1,
        'name': 'Khách hàng mẫu',
        'nhanKhau': 3,
        'chiSoMoi': 70,
        'chiSoCu': 0,
        'tieuThu': 0,
        'trongDinhMuc': 0,
        'vuotDinhMuc': 0,
    }];

    for (i in contacts) {
        contacts[i].tieuThu = contacts[i].chiSoMoi - contacts[i].chiSoCu 
        if(contacts[i].nhanKhau<4) {
            contacts[i].trongDinhMuc = 12
            contacts[i].vuotDinhMuc = contacts[i].tieuThu - 12
        }
        else {
            contacts[i].trongDinhMuc = contacts[i].nhanKhau * 4
             (contacts[i].trongDinhMuc>contacts[i].tieuThu)? contacts[i].vuotDinhMuc = 0 : contacts[i].vuotDinhMuc = contacts[i].tieuThu - contacts[i].trongDinhMuc
        }
    }

    //save method create a new contact if not already exists
    //else update the existing object
    this.save = function (contact) {
        if (contact.id == null) {
            //if this is new contact, add it in contacts array
            contact.id = uid++;
            contact.tieuThu = contact.chiSoMoi - contact.chiSoCu
         
                contact.trongDinhMuc = 12
                contact.vuotDinhMuc = Math.abs((contact.tieuThu) - 12)
               
                if(contact.nhanKhau>=4) {
                    contact.trongDinhMuc = contact.nhanKhau * 4
                 if (contact.trongDinhMuc>contact.tieuThu) {
                    contact.vuotDinhMuc = 0 
                 }
                 else contact.vuotDinhMuc = contact.tieuThu - contact.trongDinhMuc;
            }
            contacts.push(contact);
        } else {
            for (i in contacts) {
                if (contacts[i].id == contact.id) {
                    contacts[i] = contact;
                }
            }
        }

    }

    //simply search contacts list for given id
    //and returns the contact object if found
    this.get = function (id) {
        for (i in contacts) {
            if (contacts[i].id == id) {
                return contacts[i];
            }
        }

    }
    
    //iterate through contacts list and delete 
    //contact if found
    this.delete = function (id) {
        for (i in contacts) {
            if (contacts[i].id == id) {
                    contacts.splice(i, 1);
            }
        }
    }

    //simply returns the contacts list
    this.list = function () {
        return contacts;
    }
});

module.controller('ContactController', function ($scope, ContactService) {

    $scope.contacts = ContactService.list();

    $scope.saveContact = function () {
         if ($scope.well.$valid || $scope.well.vuotDinhMuc > 0) {
            ContactService.save($scope.newcontact);
            $scope.newcontact = {};
        } 
        else alert('Bạn chưa nhập đúng thông tin kìa')
    }


    $scope.delete = function (id) {
        $scope.confirm = confirm('Bạn có muốn xóa thiệt không?')
        if($scope.confirm) {
            ContactService.delete(id);
            if ($scope.newcontact.id == id) $scope.newcontact = {};
        }
    }


    $scope.edit = function (id) {
        $scope.newcontact = angular.copy(ContactService.get(id));
    }
})