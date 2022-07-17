import axios from 'axios';
import icon from '../../assets/img/notification-icon.svg'
import { BASE_URL } from '../../utils/request';
import './style.css'

type Props = { salleId: number; }

function handlerClick(sallerId: number) {
    axios(`${BASE_URL}/sales/${sallerId}/notification`)
        .then(response => console.log("SUCESSO"))
}

function NotificationsButton({ salleId }: Props) {
    return (
        <div className="dsmeta-red-btn" onClick={() => handlerClick(salleId)}>
            <img src={icon} alt="Notificar" />
        </div>
    )
}

export default NotificationsButton
