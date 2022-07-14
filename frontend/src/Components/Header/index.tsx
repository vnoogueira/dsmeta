import './style.css'
import logo from '../../assets/img/logo.svg'

function Header() {
  return (
    <div className="dsmeta-logo-container">
      <img src={logo} alt="DSMeta" />
      <h1>DSMeta</h1>
      <p>
        Desenvolvido por
        <a href="https://www.github.com/vnoogueira"> GitHub - vnoogueira</a>
      </p>
    </div>
  )
}

export default Header