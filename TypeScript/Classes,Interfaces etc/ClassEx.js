var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Study = /** @class */ (function () {
    function Study() {
    }
    Study.prototype.display = function () {
        console.log("this is the  subject  of   " + this.subject);
    };
    return Study;
}());
var Exam = /** @class */ (function (_super) {
    __extends(Exam, _super);
    function Exam() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Exam.prototype.display = function () {
        _super.prototype.display.call(this);
        console.log("this is Exam class : " + this.subject);
    };
    return Exam;
}(Study));
var obj = new Exam();
obj.subject = "mathematics";
obj.display();
