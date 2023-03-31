
import React from 'react'

class Footer extends React.Component {
    render() {
        return <h2 style={{color: 'powderblue'}}> This is a super cool footer! 🤩 </h2>
    }
}
// rafce: câu lệnh macro giúp tạo class và export default
// nếu export ở cuối file thì lúc import không cần thêm dấu {}
// nếu export ở ngay lúc khai báo function/class thì lúc import cần thêm dấu {}
export default Footer
